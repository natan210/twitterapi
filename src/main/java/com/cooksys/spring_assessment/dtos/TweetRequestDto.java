package com.cooksys.spring_assessment.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TweetRequestDto {

	private String content;
	
	private CredentialsDto credentials;
}
