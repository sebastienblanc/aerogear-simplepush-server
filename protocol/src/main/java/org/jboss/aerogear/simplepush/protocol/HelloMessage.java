/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.simplepush.protocol;

import java.util.Set;

/**
 * Represents the handshake message, 'hello' message type, in the
 * <a href="https://wiki.mozilla.org/WebAPI/SimplePush/Protocol">SimplePush specification protocol</a>
 * </p>
 * This message is sent after the initial connection handshake has been completed and represents the handshake
 * between the UserAgent and the SimplePush Server.
 *
 */
public interface HelloMessage extends MessageType {

    /**
     * The name of the channelIDs JSON field.
     */
    String CHANNEL_IDS_FIELD = "channelIDs";

    /**
     * The name of the uaid JSON field.
     */
    String UAID_FIELD = "uaid";

    /**
     * A globally unique identifier for a UserAgent created by the SimplePush Server.
     *
     * @return {@code String} a globally unique id for a UserAgent, or an empty String if the UserAgent has not
     *         been assigned a UAID yet or wants to reset it, which will create a new one.
     */
    String getUAID();

    /**
     * Channel identifiers are created on the UserAgent side and are stored by the SimplePush Server
     * and associated with the UserAgent. Every channelId has a version and an endpoint associated
     * with it.
     *
     * @return {@code Set<String>} a set of channelIds sent from the UserAgent, or an empty list if no channel
     *         ids were sent.
     */
    Set<String> getChannelIds();

}
