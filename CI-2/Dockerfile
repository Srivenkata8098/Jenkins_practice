FROM alpine

RUN apk update && apk add apache2

ADD index.html /var/www/html/

EXPOSE 80

ENTRYPOINT ["httpd", "-D", "FOREGROUND"]
