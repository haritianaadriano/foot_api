package com.prog3td.demo.controller.response.Read;

import com.prog3td.demo.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RestMatch {
    private Long id;
    private Team teamOne;
    private Team teamTwo;
    private LocalDateTime dateTime;
}
