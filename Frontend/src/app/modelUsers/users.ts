export class Users {
    public id: number;
    public username: string;
    public nickname: string;
    public password: string;
    public email: string;

    constructor(id: number, username: string, nickname: string, password: string, email: string) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }
}