package com.demideinherjar.restfulexampleproject.service;

import com.demideinherjar.restfulexampleproject.model.Client;

import java.util.List;

public interface ClientService {
    /**
     * Create new Client
     * @param client - client for create
     */
    void create(Client client);

    /**
     * Returns a list of all clients
     * @return a list of all clients
     */
    List<Client> readAll();

    /**
     * Returns the client by his ID
     * @param id - client ID
     * @return - client object with the given ID
     */
    Client read(int id);

    /**
     * Updates the client with the given ID,
     * according to the given client
     * @param client - client needed to update
     * @param id - id needed to update
     * @return - true if successful, else false
     */
    boolean update(Client client, int id);

    /**
     * Delete the client with the given ID
     * @param id - client ID
     * @return - true if successful, else false
     */
    boolean delete(int id);
}
