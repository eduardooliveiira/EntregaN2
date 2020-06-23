package Recursos;

import API.Resultados;

public class LollaRecurso {
}

@PUT
@Path("/ update/ {data}")
public void updateResultado(@QuerryParam("data") String data){
    this.DAO.deleteresultado(this.getResultadoFromString(data));
}

@DELETE
@Path("/delete/ {data}")
public void deleteResultado(@querryParam("data") String data){
    this.DAO.deleteResultado(this.getResultadoFromString(data));
}

public Resultado getResultadoFromString(String data){
    String[] cols = data.split(regex: ",");
    Resultados resultado = new Resultados();
    Resultados.setDate(cols[0]);
    Resultados.setLocal(cols[1]);
    Resultados.setAtracao(cols[2]);
    Resultados.setDate(integer.parseInt(cols[3]));
    return resultado;
}