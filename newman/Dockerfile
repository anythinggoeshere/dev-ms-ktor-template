FROM node:14

RUN npm install -g newman
COPY postman /postman
RUN chmod +x /postman/run.sh

CMD["/postman/run.sh"]