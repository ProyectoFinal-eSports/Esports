package com.esports.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class TeamFormDTO {

    private TeamDTO team;
    private MultipartFile file;

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "TeamFormDTO{" +
                "team=" + team +
                ", file=" + (file == null ? "" : file.getOriginalFilename()) +
                '}';
    }
}
