from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from sqlalchemy.ext.declarative import declarative_base
from core.config import Settings

DB_URL = Settings.DATABASE_URL
#Crea una instancia de motor SQLAlchemy
engine = create_engine(DB_URL)

#Crea una instancia de sessionmaker
SessionLocal = sessionmaker(autocommit=False,autoflush=False,bind=engine)
#Crea una BD para la clase modelos
Base = declarative_base()

#Funcion para crear la sesión de la BD

def get_session():
    session = SessionLocal()
    try:
        yield session
    finally:
        session.close()


