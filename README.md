# TheFinalProjectOnSpecialization
# Это итоговая работа по моей специализации. 
# Работа в операционной системе Linux:
su

Пункт 1
touch HomeAnimals
cat >> HomeAnimals
dog cat dog hamster hamster cat
touch PackAnimals
cat >> PackAnimals
horse horse donkey camel camel donkey
cat HomeAnimals HomeAnimals > Animals
mv Animals HumanFriends

Пункт 2
mkdir new_dir
mv HumanFriends new_dir/

Пункт 3
cd /etc/apt/sources.list.d
touch mysql.list
nano mysql.list
deb http://repo.mysql.com/apt/ubuntu/ jammy mysql-8.0
Ctrl+S
Ctrl+X

Переходим по ссылке:
https://dev.mysql.com/doc/mysql-apt-repo-quick-guide/en/
Кликаем по ссылке: 
Adding the MySQL APT Repository
Открываем в новой вкладке:
https://dev.mysql.com/downloads/repo/apt/
Скачиваем файл и копируем его путь
dpkg -i путь/название_файла.deb

apt install mysql-server -y

apt-get update

Пункт 4
cd Загрузки/
sudo apt install ./Yandex.deb -y
sudo apt remove ./Yandex.deb -y
cd
