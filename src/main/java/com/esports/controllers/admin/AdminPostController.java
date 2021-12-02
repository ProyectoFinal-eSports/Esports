package com.esports.controllers.admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esports.dto.PostDTO;
import com.esports.dto.PostFormDTO;
import com.esports.service.PostService;

@Controller
@RequestMapping("/admin")
public class AdminPostController {

	@Autowired
	private PostService postService;

	@GetMapping("post/create")
	public String postCreate(ModelMap model) {
		PostFormDTO postFormDTO = new PostFormDTO();
		postFormDTO.setPosts(postService.getPostList());
		model.put("postForm", postFormDTO);
		model.put("view", "admin/post/create");
		return "/_t/frame";
	}

	@PostMapping("post/create")
	public String postCreatePost(@ModelAttribute PostFormDTO postForm, ModelMap model, HttpSession session) {
		PostDTO postDTO = postForm.getPost();
		postService.savePost(postDTO);
		return "redirect:/admin/post/create";
	}

	@GetMapping("post/read")
	public String postRead(ModelMap model) {
		model.put("post", postService.getPostList());
		model.put("view", "admin/post/read");
		return "/_t/frame";
	}
}
