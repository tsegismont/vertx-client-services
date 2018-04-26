/*
 *  Copyright (c) 2011-2015 The original author or authors
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *       The Eclipse Public License is available at
 *       http://www.eclipse.org/legal/epl-v10.html
 *
 *       The Apache License v2.0 is available at
 *       http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
/**
 * = Vert.x Mail service (SMTP client implementation)
 *
 * Vert.x service for sending SMTP emails via the vert.x event bus by
 * a mail service running on another machine on the local network.
 *
 * == MailService
 *
 * The MailService interface supports sending mails through another server running
 * on the local network by the event bus.
 *
 * To use this project, add the following dependency to the _dependencies_ section of your build descriptor:
 *
 * * Maven (in your `pom.xml`):
 *
 * [source,xml,subs="+attributes"]
 * ----
 * <dependency>
 *   <groupId>${maven.groupId}</groupId>
 *   <artifactId>${maven.artifactId}</artifactId>
 *   <version>${maven.version}</version>
 * </dependency>
 * ----
 *
 * * Gradle (in your `build.gradle` file):
 *
 * [source,groovy,subs="+attributes"]
 * ----
 * compile ${maven.groupId}:${maven.artifactId}:${maven.version}
 * ----
 *
 * === Service client
 *
 * The service client only needs the name of the service address as parameter, the
 * default is "vertx.mail".
 *
 * [source,$lang]
 * ----
 * {@link examples.Examples#createService}
 * ----
 *
 * The behaviour of MailClient and MailService is the same, if you like you can use the
 * MailClient interface to store the MailService instance.
 *
 * A more complete example for sending a mail via the event bus is this:
 *
 * [source,$lang]
 * ----
 * {@link examples.Examples#exampleService}
 * ----
 *
 * == Service listener
 *
 * To run the service listener that sends the mails, you need to start it separately
 * e.g. with the vertx command
 *
 * [source,shell]
 * ----
 * vertx run service:io.vertx.mail-service
 * ----
 * or deploy the verticle inside your program.
 *
 * If you have a smtp server running on the machine on port 25, you can use the default config.
 *
 */
@Document(fileName = "index.adoc")
@ModuleGen(name = "vertx-mail", groupPackage = "io.vertx") package io.vertx.ext.mail;

import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.docgen.Document;
