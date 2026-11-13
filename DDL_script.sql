-------------------------------------------- DEPARTEMENT --------------------------------------------
CREATE TABLE public.departement (
	ccodep varchar(3) NOT NULL,
	dlidep varchar(26) NOT NULL,
	CONSTRAINT pk_departement PRIMARY KEY (ccodep)
);

-------------------------------------------- COMMUNE --------------------------------------------
CREATE TABLE public.commune (
	ccodep varchar(3) NOT NULL,
	ccocom varchar(3) NOT NULL,
	d40com varchar(40) NOT NULL,
	intcif varchar(2) NULL,
	CONSTRAINT pk_com PRIMARY KEY (ccodep, ccocom)
);

-------------------------------------------- APPLICATION --------------------------------------------
-- 1. Create the sequence
CREATE SEQUENCE public.application_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 999
    START WITH 1
    NO CYCLE;

-- 2. Create the table using the sequence with zero-padding (e.g., '001', '002')
CREATE TABLE public.application (
    idapplication varchar(3) NOT NULL DEFAULT lpad(nextval('public.application_seq')::text, 3, '0'),
    libelleapplication varchar(40) NOT NULL,
    CONSTRAINT pk_app PRIMARY KEY (idapplication)
);

-------------------------------------------- REQUETE --------------------------------------------
CREATE TABLE public.requete (
    idrequete varchar(3) NOT NULL DEFAULT lpad(nextval('public.requete_seq')::text, 3, '0'),
    libellerequete varchar(40) NOT NULL,
    sqlrequete text not null,
    application varchar(3),
    CONSTRAINT pk_requete PRIMARY KEY (idrequete),
    constraint fk_requete_application foreign key (application) references public.application(idapplication)
);
