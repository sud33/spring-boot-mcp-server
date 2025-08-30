package com.sud.mcp.demo.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MCPDemoService {

    @Tool(name = "ListOfAllowedTeachers",description = "List of allowed teachers")
      public List<String> getAllowedTeacherName()
      {
          return List.of("Kelvin","Mavin","Zilvinas","Gytis");
      }


    @Tool(name = "ListOfDisAllowedTeachers",description = "List of  teachers that are not allowed")
    public List<String> getDisAllowedTeacherName()
    {
        return List.of("Doontu","Diego","Maya","Sarah");
    }
}
