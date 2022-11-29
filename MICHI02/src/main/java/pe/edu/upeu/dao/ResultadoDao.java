
package pe.edu.upeu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.conn.ConnS;
import pe.edu.upeu.modelo.ResultadoTO;


public class ResultadoDao implements ResultadoDaoI{
     ConnS intance=ConnS.getInstance();
     Connection conexion=intance.getConnection();
     PreparedStatement ps;
     ResultSet rs;
     
     
    @Override
    public List listarResultados() {
        List<ResultadoTO> lista=new ArrayList();
        String sql="select * from resultado";
        try {
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
              ResultadoTO to=new ResultadoTO();
              to.setIdResultado(rs.getInt("id_resultado"));
              to.setNombrePartida(rs.getInt("Nombre_Partida"));
              to.setNombreplayer1(rs.getInt("Nombre_player1"));
              to.setNombreplayer2(rs.getInt("Nombre_player2"));
              to.setWinner(rs.getInt("Winner"));
              to.setRodolfitos(rs.getNString("Rodolfitos"));
              to.setEstado(rs.getDouble("Estado"));
              
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int crearResutado(ResultadoTO re) {
        int exec=0;
        int i=0;
        String sql="insert into resultado(NombrePartida,Nombreplayer1,Nombreplayer2,Winner,Rodolfitos,Estado) values(?,?,?,?,?,?)";
        try {
          ps=conexion.prepareStatement(sql);
          ps.setInt(++i,re.getNombrePartida());
          ps.setInt(++i,re.getNombreplayer1());
          ps.setInt(++i, re.getNombreplayer2());
          ps.setInt(++i, re.getWinner());
          ps.setString(++i, re.getRodolfitos());
          ps.setDouble(++i, re.getEstado());
          exec=ps.executeUpdate();
        } catch (Exception e) {
        }
        return exec;
    }
    
}
