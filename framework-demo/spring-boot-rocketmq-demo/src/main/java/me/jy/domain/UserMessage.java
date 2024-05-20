package me.jy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMessage {

    private Long id;

    private String name;
}
