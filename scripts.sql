create table medicos (codigo int primary key, 
						nome varchar(100) not null, 
						sexo varchar(1) not null,
						codigo_especialidade int not null, 
						nome_especialidade varchar(100) not null);


create table pacientes (codigo int primary key, 
							nome varchar(100) not null,
							sexo varchar(1) not null,
							endereco varchar(100),
							telefone varchar(100) not null, 
							codigo_plano int not null,
							nome_plano varchar(100) not null);

create table consultas(codigo int primary key, 
						codigo_medico int unique not null,
						nome_medico varchar(100) not null,
						codigo_especialidade int not null,
						nome_especialidade varchar(100) not null,
						nome_paciente varchar(100) not null,
						codigo_doenca int not null,
						nome_doenca varchar(100) not null, 
						data_consulta varchar(100) unique not null,
						hora_consulta varchar(100) unique not null,
						codigo_plano int not null,
						nome_plano varchar(100) not null);

