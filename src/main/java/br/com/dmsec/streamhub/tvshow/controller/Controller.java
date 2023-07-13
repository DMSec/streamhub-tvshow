package br.com.dmsec.streamhub.tvshow.controller;

import jakarta.annotation.security.RolesAllowed;
import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/tvshows/ping")
  @RolesAllowed({"tvshow_read"})
  public String getTvShowInfo(Principal principal) {
    return "Response from TVShow Ping Service, User Id:" + principal.getName();
  }
}
