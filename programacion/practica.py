import os
electrodomesticos = [{'nombre': 'portatil', 'precio': 1500.0, 'cantidad': 3}, {'nombre': 'microhondas', 'precio': 1000.0, 'cantidad': 2}]

def AgregarProdcuto():
    Cantidad = int(input('cuantos productos desea ingresar: '))
    os.system('cls')
    for x in range(Cantidad):
        productos = {}
        productos['nombre'] = input('nombre: ')
        productos['precio'] = float(input('precio: '))
        productos['cantidad'] = int(input('cantidad: '))
        electrodomesticos.append(productos)

#AgregarProdcuto()

def MostrarProductos():
    contador = 1
    for x in electrodomesticos:
        print('========================')
        print(f'producto {contador}')
        contador = contador + 1
        print('=======================')
        print(f'nombre : {x['nombre']}')
        print(f'precio: {x['precio']}')
        print(f'cantidad: {x['cantidad']}')

#MostrarProductos()

def HacerVenta():
    centinela = True
    while(centinela):
        venta = input('ingrese el producto a vender: ')
        cantidad  = int(input('ingrese la cantidad vendida del prioducto: '))
        os.system('cls')
        for x in electrodomesticos:
            if venta == x['nombre']:
                centinela = False
                if x['cantidad'] > 0:
                    x['cantidad'] = x['cantidad'] - cantidad
                    print('======================')
                    print('prodcuto vendido: ')
                    print('======================')
                    print(f'nombre : {x['nombre']}')
                    print(f'precio: {x['precio']}')
                    print(f'cantidad: {x['cantidad']}')
                    centinela = False
                else:
                    print('no hay productos para vender')
        if centinela == True:
            print('El producto no existe.')

#HacerVenta()

#def CalcularTotalVentas():
