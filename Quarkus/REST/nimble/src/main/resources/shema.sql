CREATE TABLE public.employee (
	id int8 NOT NULL,
	birthday date NULL,
	"level" varchar(255) NULL,
	"name" varchar(255) NULL,
	recruited date NULL,
	surname varchar(255) NULL,
	username varchar(255) NULL,
	CONSTRAINT employee_pkey PRIMARY KEY (id),
	CONSTRAINT uk_h3s92c7y4u37xsdllu12tb023 UNIQUE (username)
);

CREATE TABLE public.expertise (
	id int8 NOT NULL,
	description varchar(255) NULL,
	"name" varchar(255) NULL,
	CONSTRAINT expertise_pkey PRIMARY KEY (id),
	CONSTRAINT uk_946ussyrj3193la8y5gals571 UNIQUE (name)
);

CREATE TABLE public.employee_expertise (
	employee_id int8 NOT NULL,
	expertise_id int8 NOT NULL,
	CONSTRAINT fk9ye27vc863clsjh52pl0ois6b FOREIGN KEY (employee_id) REFERENCES public.employee(id),
	CONSTRAINT fka8wite8dr0r2x55lkej8wkyi9 FOREIGN KEY (expertise_id) REFERENCES public.expertise(id)
);
