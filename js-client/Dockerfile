FROM node:argon

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

RUN npm install connect serve-static

COPY . /usr/src/app

EXPOSE 8081

CMD ["node", "server.js"]
