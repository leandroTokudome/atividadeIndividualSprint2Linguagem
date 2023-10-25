package org.example;

import com.github.britooo.looca.api.core.Looca;
import org.springframework.jdbc.core.JdbcTemplate;

public class Componentes {
    private JdbcTemplate jdbcConnection;
    Looca looca = new Looca();
    public Componentes() {
        Connection connection = new Connection();
        this.jdbcConnection = connection.getConnection();
    }

    public void insert() {
        this.jdbcConnection.update("""
                INSERT INTO registro VALUES
                (NULL, ?, ?)
                """, Math.round(looca.getProcessador().getUso()), looca.getMemoria().getEmUso() / 1073741824);
    }

}
