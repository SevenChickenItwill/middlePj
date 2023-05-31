  CREATE TABLE "SCOTT"."BULLETINBOARD" 
   (	"BOAR_ID" NUMBER(8,0) NOT NULL ENABLE, 
	"TITLE" VARCHAR2(1000 CHAR) NOT NULL ENABLE, 
	"NICKNAME" VARCHAR2(100 CHAR), 
	"USER_ID" VARCHAR2(100 CHAR), 
	"TIME" DATE DEFAULT systimestamp, 
	"VIEWS" NUMBER(8,0) DEFAULT 0, 
	"RECOMMEND" NUMBER(8,0) DEFAULT 0, 
	"CONTENT" VARCHAR2(3000 CHAR) NOT NULL ENABLE, 
	"IMAGE" VARCHAR2(2000 CHAR) DEFAULT '', 
	"CAFEGORY" NUMBER(1,0) DEFAULT 1, 
	 CONSTRAINT "BULLETINBOARD_PK" PRIMARY KEY ("BOAR_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SCOTT"."BULLETINBOARD_TRG" 
BEFORE INSERT ON BULLETINBOARD 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    NULL;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."BULLETINBOARD_TRG" ENABLE;