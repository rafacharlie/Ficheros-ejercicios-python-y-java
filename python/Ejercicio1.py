'''
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.

@author: Rafael Infante
'''

'''
Creamos un archivo llamado primos.dat esta funcion lo crea si no lo tenemos
 y lo abrimos en modo escritura escritura = open("primos.dat","w")
'''
fichero = open("primos.dat", "w")

'''
Devuelve verdadero si el número que se pasa como parámetro es primo
   y falso en caso contrario.
@param: entero
@return: boolean
'''

'''
Esta función comprueba si un número es primo
    
@param:entero
@return: boolean
'''
def esPrimo(num):
    if num <= 1:
        return False
    elif num == 2:
        return True
    else:
        for i in range(2, num):
            if num % i == 0:
                return False
        return True
'''
Con este for compruebo los números primos del 1 al 500 y los añado al escritura
 antes creado.
'''   
for j in range(1,500):
   if esPrimo(j)==True:
       fichero.writelines(str(j)+" ")

'''
Cierro el flujo de datos
'''
fichero.close()
      
print("Fichero creado.")

