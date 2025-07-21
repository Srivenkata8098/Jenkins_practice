FROM alpine

RUN apk update && apk add --no-cache apache2 -y

ADD index.html /var/www/html/

EXPOSE 80

ENTRYPOINT ["apache2ctl -D FOREGROUND"]
