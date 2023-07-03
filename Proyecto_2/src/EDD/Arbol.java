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
    private Arbol<T> padre;

    public boolean esVacio() {
        return data == null;
    }

    public boolean esHoja() {
        return data != null && izquierdo == null && derecho == null;
    }

    private void insertarImpl(T valor, Arbol padre) {
        if (valor.getClass() == Habitacion.class) {
            if (data == null) {
                this.data = valor;
                this.padre = padre;
            } else {
                if (((Habitacion) valor).getNumero() < ((Habitacion) data).getNumero()) {
                    if (izquierdo == null) {
                        izquierdo = new Arbol();
                    }
                    izquierdo.insertarImpl(valor, this);
                } else if (((Habitacion) valor).getNumero() > ((Habitacion) data).getNumero()) {
                    if (derecho == null) {
                        derecho = new Arbol();
                    }
                    derecho.insertarImpl(valor, this);
                } else {
                    //duplicado
                }
            }
        } else if (valor.getClass() == Cliente.class) {
            if (data == null) {
                this.data = valor;
                this.padre = padre;

            } else {
                if (((Cliente) valor).getId() < ((Cliente) data).getId()) {
                    if (izquierdo == null) {
                        izquierdo = new Arbol();
                    }
                    izquierdo.insertarImpl(valor, this);
                } else if (((Cliente) valor).getId() > ((Cliente) data).getId()) {
                    if (derecho == null) {
                        derecho = new Arbol();
                    }
                    derecho.insertarImpl(valor, this);
                } else {
                    //duplicado
                }
            }
        }
    }

    public void insertar(T valor) {
        insertarImpl(valor, null);

    }

    public boolean existe(int valor) {
        if (!esVacio()) {
            
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
        } else {
            return false;
        }
    }

    public T obtener(int valor) {
        if (!esVacio()) {
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
        } else {
            return null;
        }
    }

    private Arbol minimo() {
        if (izquierdo != null && !izquierdo.esVacio()) {
            return izquierdo.minimo();
        } else {
            return this;
        }
    }

    public void eliminarImpl(int valor) {
        if (izquierdo != null && derecho != null) {
            Arbol minimo=derecho.minimo();
            this.data=(T) minimo.data;
            derecho.eliminar((int) ((Cliente) minimo.data).getId());
        } else if (izquierdo != null || derecho != null) {
            Arbol aux = izquierdo != null ? izquierdo : derecho;
            this.data = (T) aux.data;
            this.izquierdo = aux.izquierdo;
            this.derecho = aux.derecho;
        } else {
            if (padre != null) {
                if (this == padre.izquierdo) {
                    padre.izquierdo = null;
                }
                if (this == padre.derecho) {
                    padre.derecho = null;
                }
                padre = null;
            }
            data = null;
        }
    }

    public void eliminar(int valor) {
        if (!esVacio()) {
            if (data.getClass() == Habitacion.class) {
                    if (((int) valor) == ((Habitacion) data).getNumero()) {
                        eliminarImpl(valor);
                    } else if (((int) valor) < ((Habitacion) data).getNumero() && izquierdo != null) {
                        izquierdo.eliminar(valor);
                    } else {
                        if (derecho != null) {
                            derecho.eliminar(valor);
                        }
                    }
                } else {
                    if (((int) valor) == ((Cliente) data).getId()) {
                        eliminarImpl(valor);
                    } else if (((int) valor) < ((Cliente) data).getId() && izquierdo != null) {
                        izquierdo.eliminar(valor);
                    } else {
                        if (derecho != null) {
                            derecho.eliminar(valor);
                        }
                    }
                }
            }
    }
}
