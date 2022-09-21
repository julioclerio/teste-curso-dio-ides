## Conteúdo aula 3



Autenticar máquina para GitHub reconhece-la como segura:



Gerar chave no CLI no GIT

ssh-keygen -t ed25519 -C e-mail-usado-no-GitHub



ed25519 e o tipo de criptografia da chave

C maiúsculo

na linha SHA256: código

copiar o código 





comando especial para visualizar arquivos no git

cat id_ed25519.pub 

id_ed2519.pub e o arquivo gerado na pasta 

mostra a chave publica 





pwd: mostra o caminho onde você está localizado no computador



## Gerar SSH para tornar máquina segura 





Criar conta no GitHub

Vai em configurações no GitHub

SSH and GPG keys

New SSH key

Cola a chave usada 

salvar







inicializar o ssh agent depois de colar a chave no github



eval $(ssh-agent-s)

retorna 

Agent pid ... numero





entregar a chave para o agent

ssh-add id_ed25519    +enter

sem o pub no final, agora e adicionado a chave privada

digita a senha criada

retorna

identity added: id_ed25519 (email cadastrado no github)





Clonar pasta

git clone (colar SSH do diretorio do github)

aperta yes 





## Token de acesso pessoal



no github

developer settings 

personal acess tokens

new token 

note: dar nome do token

marcar opção repo

cópiar token gerado

cópiar  e salvar 





git clone (colar agora o https)







