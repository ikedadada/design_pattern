FROM eclipse-temurin:21-jdk

# 必要なパッケージと依存関係のインストール
RUN apt-get update && apt-get install -y \
    libxext6 \
    libxrender1 \
    libxtst6 \
    libxi6 \
    libx11-6 \
    libxfixes3 \
    fontconfig \
    fonts-dejavu \
    && rm -rf /var/lib/apt/lists/*

    
WORKDIR /app
