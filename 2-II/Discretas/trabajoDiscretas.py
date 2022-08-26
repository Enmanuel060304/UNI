"""
@autor: Jose Enmanuel Urbina fierro
"""

from tkinter import *

ventana = Tk()
ventana.title("clase practica")
#ancho por alto
ventana.geometry('400x300')
ventana.configure(background="Blue")

#presentacion
presentacion = Label(ventana, text="Universidad Nacional de Ingeneria",background="White", font=("Helvetica", 14))
presentacion.place(x=60, y= 40)

alumno = Label(ventana, text="Br.Jose Enmanuel Urbina Fierro", font=("Helvetica", 7))
alumno.place(x=240, y=280)
opciones1 = ["verdadero", "Falso"]
opciones2 = ["^", "v", "->", "<->"]

etiqueta1 = StringVar(ventana)
etiqueta1.set("seleccione")
opcion1 = OptionMenu(ventana, etiqueta1, *opciones1)
opcion1.config(width= 10)
opcion1.pack(padx=20, pady=20, side= LEFT)
#etiqueta1.pack(padx=20,pady=20,ipadx=20,ipady=20, side=tk.LEFT)

etiqueta2 = StringVar(ventana)
etiqueta2.set("seleccione")
opcion2 = OptionMenu(ventana, etiqueta2, *opciones2)
opcion2.config(width = 10)
opcion2.pack(padx=10, pady=20, side= LEFT)
#etiqueta2.pack(padx=10,pady=20,ipadx=20,ipady=20, side=tk.LEFT)

etiqueta3 = StringVar(ventana)
etiqueta3.set("seleccione")
opcion3 = OptionMenu(ventana, etiqueta3, *opciones1)
opcion3.config(width=10)
opcion3.pack(pady=20, padx=15, side= LEFT)

text = Label(ventana, text="el resultado es:")
text.place(x=140, y=200)



#boton calcular
boton = Button(ventana, text= "calcular")
boton.place(x=170, y=250)

ventana.mainloop()

def calculo():
    pass