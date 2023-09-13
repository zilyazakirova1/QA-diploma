FROM node:lts-alpine3.14
WORKDIR /opt/app
COPY gate-simulator /opt/app
RUN npm install
CMD ["npm", "start"]