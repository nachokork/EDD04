package cuentas;

/**Class CCuenta Nos servirá para crear cuentas con los parametros, nombre,cuenta,
 * saldo y tipo de interés.
     * @version 3.35.3 16/04/2022
     * @author Ignacio Fernandez
     */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**
     * 
     * @param nom Nos guarda el nombre del propietario de la cuenta.
     * @param cue Nos guarda el nombre de la cuenta. 
     * @param sal Nos guarda el saldo de nuestra cuenta. 
     * @param tipo Nos guarda el tipo de interés que tendra nuestra cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Pedimos el estado de la cuenta y nos devuelve el saldo
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Utilizamos el método Ingresar para ingresar dinero a nuestra cuenta, nos pide un numero (double)
     * @param cantidad es el saldo que vamos a ingresar a nuestra cuenta, sumará cantidad a saldo
     * @throws Exception añadimos una excepción que nos arroja el mensaje "No se puede ingresar una cantidad negativa" cuando ingresen una cantidad menor que 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Utilizamos el método Retirar para sacar dinero de nuestra cuenta, la operación es saldo - cantidad.
     * @param cantidad la cantidad de saldo que quiere retirar el usuario 
     * @throws Exception añadimos dos excepciones, una por si intentan retirar una cantidad menos a 0 y otra para cuando la cantidad a retirar sea mayor que la cantidad de saldo en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Pedimos el nombre con el método getNombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Ponemos el nombre con el método setNombre para cuando pidamos getNombre nos devuelva este.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Pedimos el nombre de la cuenta con el método getCuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Ponemos el nombre de la cuenta con el método setCuenta para cuando pidamos getcuenta nos devuelva este.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Pedimos que nos de el saldo con el método getSaldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Actualizamos el saldo de la cuenta con el método setSaldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Pedimos el tipo de interés con getTipoInterés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Actualizamos el tipo de interés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
