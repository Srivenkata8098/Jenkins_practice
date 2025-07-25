
FROM python:3.12-slim


RUN apt-get update && apt-get install -y \
    curl \
    gnupg \
    unzip \
    openjdk-17-jdk \
    git \
    nodejs \
    npm \
    && npm install -g snyk \
    && rm -rf /var/lib/apt/lists/*


WORKDIR /app

COPY . .

RUN pip install --no-cache -r requirements.txt


RUN curl -sSLo /tmp/sonar-scanner.zip https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli-5.0.1.3006-linux.zip \
    && unzip /tmp/sonar-scanner.zip -d /opt \
    && rm /tmp/sonar-scanner.zip \
    && mv /opt/sonar-scanner-* /opt/sonar-scanner \
    && rm -rf /tmp/sonar-scanner.zip


CMD [ "python3", "app.py" ]

