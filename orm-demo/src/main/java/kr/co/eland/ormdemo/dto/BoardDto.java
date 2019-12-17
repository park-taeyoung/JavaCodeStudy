package kr.co.eland.ormdemo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoardDto {

//요청 형식
	public static class Request {

		@JsonProperty("writer")
		String writer;

		@JsonProperty("title")
		String title;

		@JsonProperty("content")
		String content;

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

	}

//응답 형식
	public static class Response {

		@JsonProperty("id")
		int id;

		@JsonProperty("writer")
		String writer;

		@JsonProperty("title")
		String title;

		@JsonProperty("CONTENT")
		String content;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

	}

}