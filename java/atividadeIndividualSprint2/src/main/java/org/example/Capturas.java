package org.example;

import com.github.britooo.looca.api.core.Looca;
import org.springframework.jdbc.core.JdbcTemplate;

public class Capturas {
    private JdbcTemplate jdbcConnection;
    Looca looca = new Looca();
    public Capturas() {
        Connection connection = new Connection();
        this.jdbcConnection = connection.getConnection();
    }

    public void cpu() {
        this.jdbcConnection.update("""
                INSERT INTO usoCpu VALUES
                (NULL, NOW(), ?)
                """, Math.round(looca.getProcessador().getUso()));
    }

    public void memoriaRam() {
        this.jdbcConnection.update("""
                INSERT INTO memoriaRam VALUES
                (NULL, NOW(), ?)
                """, looca.getMemoria().getEmUso() / 1073741824);
    }

    public void numeroProcessos() {
        this.jdbcConnection.update("""
                INSERT INTO numeroProcessos VALUES
                (NULL, NOW(), ?)
                """, looca.getGrupoDeProcessos().getTotalProcessos());
    }

}
