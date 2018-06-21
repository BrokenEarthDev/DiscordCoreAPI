package me.brokenearth.api.role;

import me.brokenearth.api.scheduler.Timer;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.requests.RestAction;

/**
 * Copyright 2018 github.com/BrokenEarthDev
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * @author BrokenEarth // BrokenEarthDev
 * @version 1.0
 */
public final class Role {

    /**
     * Adds role/roles to a specified member
     * @param member The desired member
     * @param roles the roles that are going to be added
     * @return a rest action
     */
    public RestAction<Void> addRolesToMember(Member member, net.dv8tion.jda.core.entities.Role ...roles) {
        return member.getGuild().getController().addRolesToMember(member, roles);
    }

    /**
     * Removes role/roles from a specified member
     * @param member The desired member
     * @param roles The roles that are going to be removed
     * @return a rest action
     */
    public RestAction<Void> removeRolesFromMember(Member member, net.dv8tion.jda.core.entities.Role ...roles) {
        return member.getGuild().getController().removeRolesFromMember(member, roles);
    }
}
