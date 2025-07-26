FROM maven:3.9.6-eclipse-temurin-17

RUN apt-get update && apt install -y \
    curl \
    git \
    unzip \
    nodejs \
    npm \
    bash \
    && npm install -g snyk \
    && apt clean \
    && rm -rf /var/lib/apt/lists/*

RUN curl -sSLo sonar-scanner.zip https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli-5.0.1.3006.zip && \
    unzip sonar-scanner.zip -d /opt && \
    mv /opt/sonar-scanner-5.0.1.3006 /opt/sonar-scanner && \
    ln -s /opt/sonar-scanner/bin/sonar-scanner /usr/local/bin/sonar-scanner && \
    rm -rf sonar-scanner.zip

WORKDIR /java

COPY .  .

CMD ["/bin/bash"]
