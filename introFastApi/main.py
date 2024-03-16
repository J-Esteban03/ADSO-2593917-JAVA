from fastapi import FastAPI, Depends
#Es una Libreria que  Sirve para validar que los datos 
from pydantic import BaseModel
from db.session import get_session
from sqlalchemy.orm import Session

from models.users import User
    
class Numero(BaseModel):
    num: int


app =  FastAPI()



@app.post("/test")
async def test_db(db: Session  = Depends(get_session)):
    result = db.query(User).all()
    return {"Results": result}



@app.get("/")
async def index():
    return {"Messagge": "Hello Word"}


@app.post("/suma")
async def get_suma(num1: int ,num2: int):
    if type(num1) == str:
     return {"Resultado":num1+num2}
    else: 
        return {"Message":"No es valido"}



# ruta que reciba un numero positivo y mayor a 0 y menor que 100 y me devuelve en un json lo siguiente:
#Es par o no es par,el factorial,resultado de dividir este numero sobre el primer par primo 

def factorial(numero):
     factorial = 1
     for i in range(numero):
         factorial = factorial* (i+1)
     return factorial

@app.post("/factorial")
async def get_numero(numero: Numero):
    if numero.num>=0 and numero.num<=100:
        if numero.num % 2==0:
            numpar = "Es par"
        else:
            numpar = "Es Impar"
        fact = factorial(numero.num)
        parprimo = numero.num / 2
    else:
        return {"Message":"No es valido"}
    return {
                "El numero es": numpar,
                "El factorial es": fact,
                "División": parprimo
            } 


# Una de las funciones debe recibir datos, como nombre,edad, si esta vivo o no en un bolean ese datos 
#Y lo recibimos con un esquema