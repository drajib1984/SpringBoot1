package com.springboottutorial.School.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
@AttributeOverrides({
        @AttributeOverride(name ="name" ,column = @Column(name = "guardianName")),
        @AttributeOverride(name ="email" ,column = @Column(name = "guardianEmail")),
        @AttributeOverride(name = "mobile",column =@Column(name = "guardianMobile"))
})
public class Guardian {
    private String name;
    private String email;
    private Long mobile;
}
