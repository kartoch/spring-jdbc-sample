package fr.plil.sio.persistence.api;

public interface GroupService {

    /**
     * Create a group with a specific name in the database.
     * There is no two groups with the same name in the database.
     *
     * @param name the name of the group
     * @return an instance of the group
     * @throws IllegalArgumentException if name is null
     * @throws IllegalStateException    if a group with the same name is already present
     */
    Group create(String name);

    /**
     * Delete a group in the database. Remove all users in the group.
     *
     * @param name the name of the group to remove
     * @return true if group has been deleted, false if group is not found in the database.
     * @throws IllegalArgumentException if name is null
     */
    boolean delete(String name);

    /**
     * Find a group in the database based on its name.
     *
     * @param name the name of the group to search for.
     * @return an instance of the group if found, else null.
     * @throws IllegalArgumentException if name is null
     */
    Group findByName(String name);

    /**
     * Add an user in the group.
     *
     * @param groupName the name of the group.
     * @param userName  the name of the user to add in the group.
     * @return true if user is added in the group, false if user was already present.
     * @throws IllegalArgumentException if groupName or userName is null, or if group or user cannot be found.
     */
    boolean addUser(String groupName, String userName);

    /**
     * Remove an user in the group.
     *
     * @param groupName the name of the group.
     * @param userName  the name of the user to remove from the group.
     * @return true if user is removed from the group, false if user was not present in the group.
     * @throws IllegalArgumentException if groupName or userName is null, or if group or user cannot be found.
     */
    boolean removeUser(String groupName, String userName);

    /**
     * Add a right in the group. Right is inserted at the end of rights list of the group.
     *
     * @param groupName the name of the group.
     * @param right     the right to add
     * @return true if right is added in the group, false if right was already present.
     * @throws IllegalStateException    if a parent right is already present
     * @throws IllegalArgumentException if groupName or right is null, or if group or right cannot be found.
     */
    boolean addRight(String groupName, Right right);

    /**
     * Remove a right associated with a group.
     *
     * @param groupName the name of the group.
     * @param right     the right to remove
     * @return true if right is removed from the group, false if teh right was not present in the group.
     * @throws IllegalArgumentException if groupName or right is null, or if group or right cannot be found.
     */
    boolean removeRight(String groupName, Right right);
}
