package home.amit.rethinkdb.stream.rethink.service;
/*
User :- AmitSingh
Date :- 5/28/2024
Time :- 7:21 PM
Year :- 2024
*/

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.ast.ReqlExpr;
import com.rethinkdb.gen.ast.Table;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Result;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRoleChangeListener {
    private static final RethinkDB r = RethinkDB.r;
    private final Connection connection;
    private final String dbName;
    private final String tableName;

    @Autowired
    public UserRoleChangeListener(Connection connection) {
        this.connection = connection;
        this.dbName = "auth";
        this.tableName = "USER_ROLE";
    }

    @PostConstruct
    public void startListening() {
        try {
            Result<Object> changeCursor = r.db(dbName).table(tableName).changes().run(connection);
            for (Object change : changeCursor) {
                System.out.println(change);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
