package home.amit.rethinkdb.stream.rethink.dto;
/*
User :- AmitSingh
Date :- 5/28/2024
Time :- 7:20 PM
Year :- 2024
*/

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserRole {
    private String userId;
    private String roleId;
    private String id;
}
