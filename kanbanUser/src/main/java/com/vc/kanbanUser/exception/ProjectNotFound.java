package com.vc.kanbanUser.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Project Not Found")
public class ProjectNotFound extends Exception{
}
