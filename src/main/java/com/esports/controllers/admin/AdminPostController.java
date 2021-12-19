package com.esports.controllers.admin;

import com.esports.model.Constants;
import com.esports.model.dto.PostDTO;
import com.esports.model.dto.PostFormDTO;
import com.esports.service.PostService;
import com.esports.service.UtilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@Controller
@RequestMapping("/admin/post")
public class AdminPostController {

	public static final Logger logger = LoggerFactory.getLogger(AdminPostController.class);

	@Autowired
	private PostService postService;

	@Autowired
	private UtilService utilService;

	@GetMapping("/create")
	public String create(ModelMap model) {
		PostDTO post = new PostDTO();
		post.setDate(LocalDate.now());
		PostFormDTO postFormDTO = new PostFormDTO();
		postFormDTO.setPost(post);
		model.put("postForm", postFormDTO);
		model.put("view", "admin/post/create");

		return "_t_admin/frame";
	}

	@PostMapping("/create")
	public String createPost(@ModelAttribute PostFormDTO postForm, ModelMap model, HttpSession session) {
		logger.debug("postForm: " + postForm);
		PostDTO postDTO = postForm.getPost();
		logger.debug("PostDTO: " + postDTO);

		String resource = null;
		if (postForm.getFile() != null)
			resource = utilService.saveResourceFile(postForm.getFile(),
					Constants.STATIC_FILES_PATH + Constants.IMG_UPLOAD_DIR_POST);

		if (resource != null) {
			resource = Constants.IMG_UPLOAD_DIR_POST + resource;
			postDTO.setImgUrl(resource);
		}

		postService.savePost(postDTO);

		return "redirect:/admin/post/read";
	}

	@GetMapping("/update")
	public String update(@RequestParam("id") Long id, ModelMap model) {
		PostDTO postDTO = postService.getPostById(id);
		PostFormDTO postFormDTO = new PostFormDTO();
		postFormDTO.setPost(postDTO);

		model.put("postForm", postFormDTO);
		model.put("view", "admin/post/update");

		return "_t_admin/frame";
	}

	@PostMapping("/update")
	public String updatePost(@ModelAttribute PostFormDTO postForm, ModelMap model, HttpSession session) {
		logger.debug("postForm: " + postForm);
		PostDTO postDTO = postForm.getPost();
		logger.debug("PostDTO: " + postDTO);

		String resource = null;
		if (postForm.getFile() != null)
			resource = utilService.saveResourceFile(postForm.getFile(),
					Constants.STATIC_FILES_PATH + Constants.IMG_UPLOAD_DIR_POST);

		if (resource != null) {
			resource = Constants.IMG_UPLOAD_DIR_POST + resource;
			postDTO.setImgUrl(resource);
		}

		postService.updatePost(postDTO);

		return "redirect:/admin/post/read";
	}

	@GetMapping("/read")
	public String postRead(ModelMap model) {
		model.put("post", postService.getPostList(true));
		model.put("view", "admin/post/read");

		return "_t_admin/frame";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id, ModelMap model) {
		postService.deletePost(id);

		return "redirect:/admin/post/read";
	}
}
