package model;

public class daviplataVo { 
private int IdCuenta; 
private static int IdUsuario;
private int Saldo;  
private int valor_recarga;
private int valor_retiro;
private Boolean EstadoActivo;
public Object setIdCuenta; 
 // contructores  
public daviplataVo() {
}
public daviplataVo(int idCuenta, int idUsuario, int saldo) {
    IdCuenta = idCuenta;
    IdUsuario = idUsuario;
    Saldo = saldo;
}
// getters and setters 

public int getIdCuenta() {
    return IdCuenta;
}

public void setIdCuenta(int idCuenta) {
    IdCuenta = idCuenta;
}
public int getIdUsuario() {
    return IdUsuario;
}
public void setIdUsuario(int idUsuario) {
    IdUsuario = idUsuario;
}
public int getSaldo() {
    return Saldo;
}
public void setSaldo(int saldo) {
    Saldo = saldo;
}
public Boolean getEstadoActivo() {
    return EstadoActivo;
}
public void setEstadoActivo(Boolean estadoActivo) {
    EstadoActivo = estadoActivo;
}
public int getValor_recarga() {
    return valor_recarga;
}
public void setValor_recarga(int valor_recarga) {
    this.valor_recarga = valor_recarga;
}
public int getValor_retiro() {
    return valor_retiro;
}
public void setValor_retiro(int valor_retiro) {
    this.valor_retiro = valor_retiro;
}
}
