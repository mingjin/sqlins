/*
 * Copyright 2010 Ming Jin(skyairmj@gmail.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package sqlins

class Criteria(criteria: String){
    def and (criterion: Criteria): Criteria = {
        new Criteria (" (" concat criteria.substring(1) concat " and" concat criterion.toString concat ")")
    }
    
    def or (criterion: Criteria): Criteria = {
        new Criteria (" (" concat criteria.substring(1) concat " or" concat criterion.toString concat ")")
    }
    
    override def toString() : String = criteria
}