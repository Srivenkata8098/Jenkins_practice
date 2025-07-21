FROM alpine

RUN apk update && apk add apache2

ADD index.html /var/www/localhost/htdocs/

EXPOSE 80

ENTRYPOINT ["httpd", "-D", "FOREGROUND"]
