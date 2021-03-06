/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package HSL;

import javax.xml.ws.WebFault;

@WebFault(name = "UnknownPersonFault")
public class UnknownPersonFault extends Exception {
    public static final long serialVersionUID = 20081110144906L;

    private HSL.types.UnknownPersonFault unknownPersonFault;

    public UnknownPersonFault() {
        super();
    }

    public UnknownPersonFault(String message) {
        super(message);
    }

    public UnknownPersonFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownPersonFault(String message, HSL.types.UnknownPersonFault unknownPersonFault) {
        super(message);
        this.unknownPersonFault = unknownPersonFault;
    }

    public UnknownPersonFault(String message, HSL.types.UnknownPersonFault unknownPersonFault, Throwable cause) {
        super(message, cause);
        this.unknownPersonFault = unknownPersonFault;
    }

    public HSL.types.UnknownPersonFault getFaultInfo() {
        return this.unknownPersonFault;
    }
}
