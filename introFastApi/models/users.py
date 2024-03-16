from datetime import datetime
from enum import Enum
from  sqlalchemy import Column, String, Boolean ,TIMESTAMP,DateTime
from  sqlalchemy.orm import relationship 
from  sqlalchemy.dialects.postgresql import UUID
import uuid

class User():
    __tablename__= 'users'
    user_id  = Column(String(30),primary_key=True)
    full_name = Column(String(80))
    mail = Column(String(100),unique=True)
    passhash = Column(String(140))
    user_role = Column(String(10))
    user_status = Column(Boolean,default=True)
    created_at = Column(TIMESTAMP, default=datetime.utcnow)
    updated_at = Column(DateTime, default=datetime.utcnow,onupdate=datetime.utcnow)

    transactions = relationship("Transaction",back_populates="user")

