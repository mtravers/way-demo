# Heroku deployment
set -e
lein do clean, uberjar
heroku deploy:jar target/way-demo-0.1.7.jar --jdk=21.0.2
