package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CourseCategoryController {
  @GetMapping("/course-category/tree-nodes")
  public List<CourseCategoryTreeDto> queryTreeNodes() {
    return null;
  }
}
