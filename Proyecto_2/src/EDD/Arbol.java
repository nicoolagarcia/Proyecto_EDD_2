/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Class.Cliente;
import Class.Habitacion;

/**
 *
 * @author Nicola
 */
public class Arbol<T> {

    private T data;
    private Arbol<T> izquierdo, derecho;

    public boolean esVacio() {
        return data == null;
    }

    public boolean esHoja() {
        return data != null && izquierdo == null && derecho == null;
    }

    public void insertar(T valor) {
        if (valor.getClass() == Habitacion.class) {
            if (data == null) {
                this.data = valor;
            } else {
                if (((Habitacion) valor).getNumero() < ((Habitacion) data).getNumero()) {
                    if (izquierdo == null) {
                        izquierdo = new Arbol();
                    }
                    izquierdo.insertar(valor);
                } else if (((Habitacion) valor).getNumero() > ((Habitacion) data).getNumero()) {
                    if (derecho == null) {
                        derecho = new Arbol();
                    }
                    derecho.insertar(valor);
                } else {
                    //duplicado
                }
            }
        } else if (valor.getClass() == Cliente.class) {
            if (data == null) {
                this.data = valor;
            } else {
                if (((Cliente) valor).getId() < ((Cliente) data).getId()) {
                    if (izquierdo == null) {
                        izquierdo = new Arbol();
                    }
                    izquierdo.insertar(valor);
                } else if (((Cliente) valor).getId() > ((Cliente) data).getId()) {
                    if (derecho == null) {
                        derecho = new Arbol();
                    }
                    derecho.insertar(valor);
                } else {
                    //duplicado
                }
            }
        }
    }

    public boolean existe(T valor) {
        if (!esVacio()) {
            if (valor.getClass() == Habitacion.class) {
                if (((Habitacion) valor).getNumero() == ((Habitacion) data).getNumero()) {
                    return true;
                } else if (((Habitacion) valor).getNumero() < ((Habitacion) data).getNumero() && izquierdo != null) {
                    return izquierdo.existe(valor);
                } else {
                    if (derecho != null) {
                        return derecho.existe(valor);
                    } else {
                        return false;
                    }
                }
            } else if (valor.getClass() == Cliente.class) {
                if (((Cliente) valor).getId() == ((Cliente) data).getId()) {
                    return true;
                } else if (((Cliente) valor).getId() < ((Cliente) data).getId() && izquierdo != null) {
                    return izquierdo.existe(valor);
                } else {
                    if (derecho != null) {
                        return derecho.existe(valor);
                    } else {
                        return false;
                    }
                }
            } else {
                if (data.getClass() == Habitacion.class) {
                    if (((int) valor) == ((Habitacion) data).getNumero()) {
                        return true;
                    } else if (((int) valor) < ((Habitacion) data).getNumero() && izquierdo != null) {
                        return izquierdo.existe(valor);
                    } else {
                        if (derecho != null) {
                            return derecho.existe(valor);
                        } else {
                            return false;
                        }
                    }
                } else {
                    if (((int) valor) == ((Cliente) data).getId()) {
                        return true;
                    } else if (((int) valor) < ((Cliente) data).getId() && izquierdo != null) {
                        return izquierdo.existe(valor);
                    } else {
                        if (derecho != null) {
                            return derecho.existe(valor);
                        } else {
                            return false;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    public T obtener(T valor) {
        if (!esVacio()) {
            if (valor.getClass() == Habitacion.class) {
                if (((Habitacion) valor).getNumero() == ((Habitacion) data).getNumero()) {
                    return data;
                } else if (((Habitacion) valor).getNumero() < ((Habitacion) data).getNumero() && izquierdo != null) {
                    return izquierdo.obtener(valor);
                } else {
                    if (derecho != null) {
                        return derecho.obtener(valor);
                    } else {
                        return null;
                    }
                }
            } else if (valor.getClass() == Cliente.class) {
                if (((Cliente) valor).getId() == ((Cliente) data).getId()) {
                    return data;
                } else if (((Cliente) valor).getId() < ((Cliente) data).getId() && izquierdo != null) {
                    return izquierdo.obtener(valor);
                } else {
                    if (derecho != null) {
                        return derecho.obtener(valor);
                    } else {
                        return null;
                    }
                }
            } else {
                if (data.getClass() == Habitacion.class) {
                    if (((int) valor) == ((Habitacion) data).getNumero()) {
                        return data;
                    } else if (((int) valor) < ((Habitacion) data).getNumero() && izquierdo != null) {
                        return izquierdo.obtener(valor);
                    } else {
                        if (derecho != null) {
                            return derecho.obtener(valor);
                        } else {
                            return null;
                        }
                    }
                } else {
                    if (((int) valor) == ((Cliente) data).getId()) {
                        return data;
                    } else if (((int) valor) < ((Cliente) data).getId() && izquierdo != null) {
                        return izquierdo.obtener(valor);
                    } else {
                        if (derecho != null) {
                            return derecho.obtener(valor);
                        } else {
                            return null;
                        }
                    }
                }
            }
        } else {
            return null;
        }
    }

}
