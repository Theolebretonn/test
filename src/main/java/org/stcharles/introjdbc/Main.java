package org.stcharles.introjdbc;

import org.stcharles.introjdbc.model.Artist;

import java.sql.DriverManager;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        try {
            var jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
            var conn = DriverManager.getConnection(jdbcUrl, "postgres", "postgres");

            var stmt = conn.createStatement();
            var rs = stmt.executeQuery("SELECT * FROM artist");

            while (rs.next()) {
                var id = rs.getObject("id", UUID.class);
                var name = rs.getString("name");

                var artist = new Artist(id, name);

                System.out.println(artist.getName());
            }


        } catch (Exception e) {

        }
    }
}