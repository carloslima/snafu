FROM gettyimages/spark:2.2.0-hadoop-2.7

#ADD sbt-1.0.1.tgz /opt
RUN curl -L 'https://cocl.us/sbt-1.0.1.tgz' | tar -C /opt -xz
ENV PATH /opt/sbt/bin:$PATH
RUN sbt about

WORKDIR /code

CMD bash
