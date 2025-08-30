package com.sud.mcp.demo;

import com.sud.mcp.demo.service.MCPDemoService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication

public class McpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpDemoApplication.class, args);
	}

	@Bean
	public List<ToolCallback> registeredTools(MCPDemoService mcpDemoService)
	{
		return List.of(ToolCallbacks.from(mcpDemoService));
	}
}
