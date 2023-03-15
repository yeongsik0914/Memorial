package com.memorial.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
public class SiteUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String password;
	
	@Column(unique =true)
	private String email;
	
	//StopMotion과의 연관 관계 설정
	@OneToMany(mappedBy = "siteUser", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<StopMotion> stopMotions = new ArrayList<>();

	// Thumbnail과의 연관 관계 설정
    @OneToMany(mappedBy = "siteUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Thumbnail> thumbnails = new ArrayList<>();
    
    // Film과의 연관 관계 설정
    @OneToMany(mappedBy = "siteUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Film> films = new ArrayList<>();
}
